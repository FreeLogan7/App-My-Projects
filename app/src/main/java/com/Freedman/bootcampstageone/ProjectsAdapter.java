package com.Freedman.bootcampstageone;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectsViewHolder> {

    private Project[] projects;


    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }


    @Override
    public int getItemCount() {
        return projects.length;
    }

    @NonNull
    @Override
    public ProjectsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.e("adapter",  "" +parent.getId() );
        Log.e("check here",  "" +R.id.recycler_view );
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);

        return new ProjectsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectsViewHolder holder, int position) {

        holder.bind(projects[position]);


    }


    static class ProjectsViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView description;
        ImageView image;

        public ProjectsViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_view_title);
            description = itemView.findViewById(R.id.text_view_description);
            image = itemView.findViewById(R.id.image_view_project_icon);

        }

        public void bind(Project projects) {

            title.setText(projects.name);
            description.setText(projects.description);
            image.setImageResource(projects.image);

        }

    }


}
