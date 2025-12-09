package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VillebrunasterFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root2;
	private final ModelPart core2;
	private final ModelPart armmiddlebase6;
	private final ModelPart armbase6;
	private final ModelPart armmiddlebase7;
	private final ModelPart armbase7;
	private final ModelPart armmiddlebase8;
	private final ModelPart armbase8;
	private final ModelPart armmiddlebase9;
	private final ModelPart armbase9;
	private final ModelPart armmiddlebase10;
	private final ModelPart armbase10;
	private final ModelPart core3;
	private final ModelPart armmiddlebase11;
	private final ModelPart armbase11;
	private final ModelPart armmiddlebase12;
	private final ModelPart armbase12;
	private final ModelPart armmiddlebase13;
	private final ModelPart armbase13;
	private final ModelPart armmiddlebase14;
	private final ModelPart armbase14;
	private final ModelPart armmiddlebase15;
	private final ModelPart armbase15;
	private final ModelPart root;
	private final ModelPart core;
	private final ModelPart armmiddlebase;
	private final ModelPart armbase;
	private final ModelPart armmiddlebase2;
	private final ModelPart armbase2;
	private final ModelPart armmiddlebase3;
	private final ModelPart armbase3;
	private final ModelPart armmiddlebase4;
	private final ModelPart armbase4;
	private final ModelPart armmiddlebase5;
	private final ModelPart armbase5;

	public VillebrunasterFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root2 = this.fossil.getChild("root2");
		this.core2 = this.root2.getChild("core2");
		this.armmiddlebase6 = this.core2.getChild("armmiddlebase6");
		this.armbase6 = this.armmiddlebase6.getChild("armbase6");
		this.armmiddlebase7 = this.core2.getChild("armmiddlebase7");
		this.armbase7 = this.armmiddlebase7.getChild("armbase7");
		this.armmiddlebase8 = this.core2.getChild("armmiddlebase8");
		this.armbase8 = this.armmiddlebase8.getChild("armbase8");
		this.armmiddlebase9 = this.core2.getChild("armmiddlebase9");
		this.armbase9 = this.armmiddlebase9.getChild("armbase9");
		this.armmiddlebase10 = this.core2.getChild("armmiddlebase10");
		this.armbase10 = this.armmiddlebase10.getChild("armbase10");
		this.core3 = this.root2.getChild("core3");
		this.armmiddlebase11 = this.core3.getChild("armmiddlebase11");
		this.armbase11 = this.armmiddlebase11.getChild("armbase11");
		this.armmiddlebase12 = this.core3.getChild("armmiddlebase12");
		this.armbase12 = this.armmiddlebase12.getChild("armbase12");
		this.armmiddlebase13 = this.core3.getChild("armmiddlebase13");
		this.armbase13 = this.armmiddlebase13.getChild("armbase13");
		this.armmiddlebase14 = this.core3.getChild("armmiddlebase14");
		this.armbase14 = this.armmiddlebase14.getChild("armbase14");
		this.armmiddlebase15 = this.core3.getChild("armmiddlebase15");
		this.armbase15 = this.armmiddlebase15.getChild("armbase15");
		this.root = this.fossil.getChild("root");
		this.core = this.root.getChild("core");
		this.armmiddlebase = this.core.getChild("armmiddlebase");
		this.armbase = this.armmiddlebase.getChild("armbase");
		this.armmiddlebase2 = this.core.getChild("armmiddlebase2");
		this.armbase2 = this.armmiddlebase2.getChild("armbase2");
		this.armmiddlebase3 = this.core.getChild("armmiddlebase3");
		this.armbase3 = this.armmiddlebase3.getChild("armbase3");
		this.armmiddlebase4 = this.core.getChild("armmiddlebase4");
		this.armbase4 = this.armmiddlebase4.getChild("armbase4");
		this.armmiddlebase5 = this.core.getChild("armmiddlebase5");
		this.armbase5 = this.armmiddlebase5.getChild("armbase5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(40, 42).addBox(-5.0F, -2.0F, -7.0F, 11.0F, 2.0F, 13.0F, new CubeDeformation(0.003F))
				.texOffs(0, 0).addBox(3.0F, -2.0F, -16.0F, 7.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(37, 0).addBox(-6.1811F, -1.0F, 0.0261F, 6.0F, 2.0F, 18.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(10.2F, -1.0F, 6.1F, 0.0F, -1.0647F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 25).addBox(-8.0F, -1.0F, 2.0F, 13.0F, 2.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 25).addBox(-4.5F, -1.0F, -10.5F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8F, -1.0F, -5.6F, 0.0F, -0.829F, 0.0F));

		PartDefinition root2 = fossil.addOrReplaceChild("root2", CubeListBuilder.create(), PartPose.offset(-8.0F, -2.1F, 5.0F));

		PartDefinition core2 = root2.addOrReplaceChild("core2", CubeListBuilder.create().texOffs(0, 46).addBox(-3.0F, 0.025F, -4.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.01F))
				.texOffs(0, 0).addBox(-2.0F, -0.025F, -3.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition armmiddlebase6 = core2.addOrReplaceChild("armmiddlebase6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition armbase6 = armmiddlebase6.addOrReplaceChild("armbase6", CubeListBuilder.create().texOffs(37, 13).addBox(-1.5F, 1.0F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(37, 0).addBox(-1.0F, 0.9F, -3.35F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(11, 29).addBox(-0.5F, 1.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r1 = armbase6.addOrReplaceChild("arm1base_r1", CubeListBuilder.create().texOffs(50, 62).addBox(-0.375F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r2 = armbase6.addOrReplaceChild("arm1base_r2", CubeListBuilder.create().texOffs(58, 59).addBox(-3.625F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armmiddlebase7 = core2.addOrReplaceChild("armmiddlebase7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -1.2566F, 0.0F));

		PartDefinition armbase7 = armmiddlebase7.addOrReplaceChild("armbase7", CubeListBuilder.create().texOffs(37, 9).addBox(-1.5F, 0.985F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(0, 36).addBox(-1.0F, 0.9F, -3.35F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(8, 25).addBox(-0.5F, 1.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r3 = armbase7.addOrReplaceChild("arm1base_r3", CubeListBuilder.create().texOffs(39, 61).addBox(-0.375F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r4 = armbase7.addOrReplaceChild("arm1base_r4", CubeListBuilder.create().texOffs(59, 21).addBox(-3.625F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armmiddlebase8 = core2.addOrReplaceChild("armmiddlebase8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -2.5133F, 0.0F));

		PartDefinition armbase8 = armmiddlebase8.addOrReplaceChild("armbase8", CubeListBuilder.create().texOffs(37, 5).addBox(-1.5F, 0.99F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(35, 30).addBox(-1.0F, 0.9F, -3.35F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 19).addBox(-0.5F, 1.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r5 = armbase8.addOrReplaceChild("arm1base_r5", CubeListBuilder.create().texOffs(26, 61).addBox(-0.375F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r6 = armbase8.addOrReplaceChild("arm1base_r6", CubeListBuilder.create().texOffs(47, 58).addBox(-3.625F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armmiddlebase9 = core2.addOrReplaceChild("armmiddlebase9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 2.5133F, 0.0F));

		PartDefinition armbase9 = armmiddlebase9.addOrReplaceChild("armbase9", CubeListBuilder.create().texOffs(35, 35).addBox(-1.5F, 1.0F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(35, 25).addBox(-1.0F, 0.9F, -3.35F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(10, 18).addBox(-0.5F, 1.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r7 = armbase9.addOrReplaceChild("arm1base_r7", CubeListBuilder.create().texOffs(13, 61).addBox(-0.375F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r8 = armbase9.addOrReplaceChild("arm1base_r8", CubeListBuilder.create().texOffs(34, 58).addBox(-3.625F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armmiddlebase10 = core2.addOrReplaceChild("armmiddlebase10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 1.2566F, 0.0F));

		PartDefinition armbase10 = armmiddlebase10.addOrReplaceChild("armbase10", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, 0.99F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(0, 31).addBox(-1.0F, 0.9F, -3.35F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 3).addBox(-0.5F, 1.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r9 = armbase10.addOrReplaceChild("arm1base_r9", CubeListBuilder.create().texOffs(0, 61).addBox(-0.375F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r10 = armbase10.addOrReplaceChild("arm1base_r10", CubeListBuilder.create().texOffs(23, 57).addBox(-3.625F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition core3 = root2.addOrReplaceChild("core3", CubeListBuilder.create(), PartPose.offset(14.0F, 0.0F, 5.5F));

		PartDefinition core_r1 = core3.addOrReplaceChild("core_r1", CubeListBuilder.create().texOffs(2, 2).addBox(-2.0F, 0.0F, -1.1F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0113F, -0.025F, -2.7532F, 0.0F, 0.5236F, 0.0F));

		PartDefinition core_r2 = core3.addOrReplaceChild("core_r2", CubeListBuilder.create().texOffs(6, 51).addBox(-1.4F, 0.0F, 0.3F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 0.025F, -3.5F, 0.0F, 0.4974F, 0.0F));

		PartDefinition armmiddlebase11 = core3.addOrReplaceChild("armmiddlebase11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition armbase11 = armmiddlebase11.addOrReplaceChild("armbase11", CubeListBuilder.create().texOffs(37, 13).addBox(-1.5F, 1.0F, -2.95F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(37, 0).addBox(-1.0F, 0.9F, -3.65F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(11, 29).addBox(-0.5F, 1.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r11 = armbase11.addOrReplaceChild("arm1base_r11", CubeListBuilder.create().texOffs(50, 62).addBox(-0.375F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r12 = armbase11.addOrReplaceChild("arm1base_r12", CubeListBuilder.create().texOffs(58, 59).addBox(-3.625F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armmiddlebase12 = core3.addOrReplaceChild("armmiddlebase12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -1.2566F, 0.0F));

		PartDefinition armbase12 = armmiddlebase12.addOrReplaceChild("armbase12", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition armmiddlebase13 = core3.addOrReplaceChild("armmiddlebase13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -2.5133F, 0.0F));

		PartDefinition armbase13 = armmiddlebase13.addOrReplaceChild("armbase13", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition armmiddlebase14 = core3.addOrReplaceChild("armmiddlebase14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 2.5133F, 0.0F));

		PartDefinition armbase14 = armmiddlebase14.addOrReplaceChild("armbase14", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition armmiddlebase15 = core3.addOrReplaceChild("armmiddlebase15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 1.2566F, 0.0F));

		PartDefinition armbase15 = armmiddlebase15.addOrReplaceChild("armbase15", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, 0.9F, -4.35F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 3).addBox(-0.5F, 1.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r13 = armbase15.addOrReplaceChild("arm1base_r13", CubeListBuilder.create().texOffs(0, 61).addBox(-0.375F, -24.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r14 = armbase15.addOrReplaceChild("arm1base_r14", CubeListBuilder.create().texOffs(24, 57).addBox(-2.625F, -24.0F, 0.35F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition arm1base_r15 = armbase15.addOrReplaceChild("arm1base_r15", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, 0.0F, -0.8F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.99F, -1.25F, 0.0F, -0.7418F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, -3.1F, -8.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition core = root.addOrReplaceChild("core", CubeListBuilder.create().texOffs(25, 46).addBox(-3.0F, -0.975F, -4.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.01F))
				.texOffs(13, 0).addBox(-1.0F, -0.825F, -2.1F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition armmiddlebase = core.addOrReplaceChild("armmiddlebase", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition armbase = armmiddlebase.addOrReplaceChild("armbase", CubeListBuilder.create().texOffs(13, 57).addBox(-1.5F, 0.0F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(19, 46).addBox(-0.5F, 0.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r16 = armbase.addOrReplaceChild("arm1base_r16", CubeListBuilder.create().texOffs(13, 67).addBox(-0.375F, -25.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r17 = armbase.addOrReplaceChild("arm1base_r17", CubeListBuilder.create().texOffs(26, 67).addBox(-3.625F, -25.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armmiddlebase2 = core.addOrReplaceChild("armmiddlebase2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -1.2566F, 0.0F));

		PartDefinition armbase2 = armmiddlebase2.addOrReplaceChild("armbase2", CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -0.015F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(46, 0).addBox(-0.5F, 0.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r18 = armbase2.addOrReplaceChild("arm1base_r18", CubeListBuilder.create().texOffs(61, 66).addBox(-0.375F, -25.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r19 = armbase2.addOrReplaceChild("arm1base_r19", CubeListBuilder.create().texOffs(0, 67).addBox(-3.625F, -25.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armmiddlebase3 = core.addOrReplaceChild("armmiddlebase3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -2.5133F, 0.0F));

		PartDefinition armbase3 = armmiddlebase3.addOrReplaceChild("armbase3", CubeListBuilder.create().texOffs(26, 53).addBox(-1.5F, -0.01F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(8, 6).addBox(-0.5F, 0.15F, -4.25F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(11, 39).addBox(-0.5F, 0.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r20 = armbase3.addOrReplaceChild("arm1base_r20", CubeListBuilder.create().texOffs(39, 64).addBox(-0.375F, -25.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r21 = armbase3.addOrReplaceChild("arm1base_r21", CubeListBuilder.create().texOffs(50, 65).addBox(-3.625F, -25.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armmiddlebase4 = core.addOrReplaceChild("armmiddlebase4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 2.5133F, 0.0F));

		PartDefinition armbase4 = armmiddlebase4.addOrReplaceChild("armbase4", CubeListBuilder.create().texOffs(13, 53).addBox(-1.5F, 0.0F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(11, 35).addBox(-0.5F, 0.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(0, 11).addBox(-0.5F, 0.15F, -4.25F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r22 = armbase4.addOrReplaceChild("arm1base_r22", CubeListBuilder.create().texOffs(47, 13).addBox(1.4334F, 0.0F, -2.3435F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 10).addBox(0.9485F, -0.05F, -0.7141F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3674F, 0.1F, 1.5427F, -3.1416F, 1.1345F, 3.1416F));

		PartDefinition arm1base_r23 = armbase4.addOrReplaceChild("arm1base_r23", CubeListBuilder.create().texOffs(0, 41).addBox(-3.4053F, -0.05F, -2.2468F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 48).addBox(-2.9204F, -0.05F, -0.6174F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3674F, 0.1F, 1.5427F, 0.0F, 0.5236F, 0.0F));

		PartDefinition arm1base_r24 = armbase4.addOrReplaceChild("arm1base_r24", CubeListBuilder.create().texOffs(44, 46).addBox(1.42F, 0.0F, -2.5667F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 12).addBox(0.9351F, -0.05F, -0.9373F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.949F, 0.1F, 2.9692F, -3.1416F, -0.1047F, 3.1416F));

		PartDefinition arm1base_r25 = armbase4.addOrReplaceChild("arm1base_r25", CubeListBuilder.create().texOffs(47, 5).addBox(-3.6288F, -0.05F, -2.2529F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 53).addBox(-3.144F, -0.05F, -0.6235F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.949F, 0.1F, 2.9692F, -3.1416F, 1.3788F, 3.1416F));

		PartDefinition arm1base_r26 = armbase4.addOrReplaceChild("arm1base_r26", CubeListBuilder.create().texOffs(0, 25).addBox(-0.6743F, 0.05F, -4.9069F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.949F, 0.1F, 2.9692F, -3.1416F, 0.637F, 3.1416F));

		PartDefinition arm1base_r27 = armbase4.addOrReplaceChild("arm1base_r27", CubeListBuilder.create().texOffs(47, 9).addBox(-3.653F, -0.05F, -2.317F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 50).addBox(-3.1681F, -0.05F, -0.6876F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6684F, 0.1F, 3.1538F, -3.1416F, 0.1309F, 3.1416F));

		PartDefinition arm1base_r28 = armbase4.addOrReplaceChild("arm1base_r28", CubeListBuilder.create().texOffs(24, 46).addBox(1.4817F, 0.0F, -2.5964F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 4).addBox(0.9968F, -0.05F, -0.967F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6684F, 0.1F, 3.1538F, -3.1416F, -1.3526F, 3.1416F));

		PartDefinition arm1base_r29 = armbase4.addOrReplaceChild("arm1base_r29", CubeListBuilder.create().texOffs(8, 12).addBox(-0.6489F, 0.05F, -4.9705F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6684F, 0.1F, 3.1538F, -3.1416F, -0.6109F, 3.1416F));

		PartDefinition arm1base_r30 = armbase4.addOrReplaceChild("arm1base_r30", CubeListBuilder.create().texOffs(36, 53).addBox(-3.5954F, -0.05F, -2.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 67).addBox(-3.1105F, -0.05F, -0.8738F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1323F, 0.1F, 1.5807F, -3.1416F, -1.1345F, 3.1416F));

		PartDefinition arm1base_r31 = armbase4.addOrReplaceChild("arm1base_r31", CubeListBuilder.create().texOffs(0, 5).addBox(-0.4806F, 0.05F, -5.0688F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1323F, 0.1F, 1.5807F, 0.0F, -1.2654F, 0.0F));

		PartDefinition arm1base_r32 = armbase4.addOrReplaceChild("arm1base_r32", CubeListBuilder.create().texOffs(68, 6).addBox(1.1873F, -0.05F, -0.9258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 49).addBox(1.6721F, 0.0F, -2.5552F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1323F, 0.1F, 1.5807F, 0.0F, -0.5236F, 0.0F));

		PartDefinition arm1base_r33 = armbase4.addOrReplaceChild("arm1base_r33", CubeListBuilder.create().texOffs(68, 8).addBox(7.5017F, -0.1F, 6.9485F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 67).addBox(7.9866F, -0.05F, 5.3191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.9947F, 0.15F, -0.7208F, 0.0F, 0.7418F, 0.0F));

		PartDefinition arm1base_r34 = armbase4.addOrReplaceChild("arm1base_r34", CubeListBuilder.create().texOffs(68, 2).addBox(-1.196F, -0.1F, -0.5399F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 0).addBox(-1.6809F, -0.1F, -2.1693F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2053F, 0.15F, -0.7208F, 0.0F, -0.7418F, 0.0F));

		PartDefinition arm1base_r35 = armbase4.addOrReplaceChild("arm1base_r35", CubeListBuilder.create().texOffs(13, 64).addBox(-0.375F, -25.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r36 = armbase4.addOrReplaceChild("arm1base_r36", CubeListBuilder.create().texOffs(26, 64).addBox(-3.625F, -25.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armmiddlebase5 = core.addOrReplaceChild("armmiddlebase5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 1.2566F, 0.0F));

		PartDefinition armbase5 = armmiddlebase5.addOrReplaceChild("armbase5", CubeListBuilder.create().texOffs(0, 53).addBox(-1.5F, -0.01F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(9, 32).addBox(-0.5F, 0.0F, -4.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition arm1base_r37 = armbase5.addOrReplaceChild("arm1base_r37", CubeListBuilder.create().texOffs(61, 63).addBox(-0.375F, -25.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 25.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition arm1base_r38 = armbase5.addOrReplaceChild("arm1base_r38", CubeListBuilder.create().texOffs(0, 64).addBox(-3.625F, -25.0F, 0.35F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 25.0F, -4.25F, 0.0F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 70);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}